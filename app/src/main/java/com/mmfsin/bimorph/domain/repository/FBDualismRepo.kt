package com.mmfsin.bimorph.domain.repository

import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.mmfsin.bimorph.domain.models.DTOCategory

class FBDualismRepo(private val listener: IFBDualism) {

    private var categoryRoot = Firebase.database.reference.child("category")
    private var dualismRoot = Firebase.database.reference.child("dualism")

    fun getCategoryNames() {
        categoryRoot.get()
            .addOnSuccessListener {
                val names = mutableListOf<DTOCategory>()
                for (child in it.children) {
                    child.getValue(DTOCategory::class.java)?.let { category ->
                        names.add(category)
                    }
                }
                listener.getCategoryNames(names)

            }.addOnFailureListener {
                listener.somethingWentWrong()
            }
    }

    interface IFBDualism {
        fun getCategoryNames(names: List<DTOCategory>)
        fun somethingWentWrong()
    }
}