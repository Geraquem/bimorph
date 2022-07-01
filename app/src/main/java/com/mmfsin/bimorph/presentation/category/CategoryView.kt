package com.mmfsin.bimorph.presentation.category

import com.mmfsin.bimorph.domain.models.DTOCategory
import com.mmfsin.bimorph.domain.repository.FBDualismRepo
import com.mmfsin.bimorph.domain.repository.FBDualismRepo.IFBDualism

interface CategoryView{
    fun setCategoryNames(names: List<DTOCategory>)
    fun somethingWentWrong()
}