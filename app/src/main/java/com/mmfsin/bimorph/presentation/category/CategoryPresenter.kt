package com.mmfsin.bimorph.presentation.category

import com.mmfsin.bimorph.domain.models.DTOCategory
import com.mmfsin.bimorph.domain.repository.FBDualismRepo
import com.mmfsin.bimorph.domain.repository.FBDualismRepo.IFBDualism
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class CategoryPresenter(private val view: CategoryView) : IFBDualism, CoroutineScope {

    override val coroutineContext: CoroutineContext = Dispatchers.Main

    private val repo by lazy { FBDualismRepo(this) }

    fun getCategoryNames() {
        launch(Dispatchers.IO) {
            repo.getCategoryNames()
        }
    }

    override fun getCategoryNames(names: List<DTOCategory>) {
        launch { view.setCategoryNames(names) }
    }

    override fun somethingWentWrong() {
        launch { view.somethingWentWrong() }
    }
}