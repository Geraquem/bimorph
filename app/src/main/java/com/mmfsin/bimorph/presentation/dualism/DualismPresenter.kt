package com.mmfsin.bimorph.presentation.dualism

import com.mmfsin.bimorph.domain.models.DTOCategory
import com.mmfsin.bimorph.domain.repository.FBDualismRepo
import com.mmfsin.bimorph.domain.repository.FBDualismRepo.IFBDualism
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class DualismPresenter(private val view: DualismView) : IFBDualism, CoroutineScope {

    override val coroutineContext: CoroutineContext = Dispatchers.Main

    private val repo by lazy { FBDualismRepo(this) }

    override fun getCategoryNames(names: List<DTOCategory>) {}

    override fun somethingWentWrong() {
        launch {
            view.somethingWentWrong()
        }
    }
}