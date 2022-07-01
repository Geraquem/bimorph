package com.mmfsin.bimorph.presentation.category

import com.mmfsin.bimorph.domain.models.DTOCategory
import com.mmfsin.bimorph.domain.repository.FBDualismRepo
import com.mmfsin.bimorph.domain.repository.FBDualismRepo.IFBDualism

interface CategoryView{
    fun setCategories(categories: List<DTOCategory>)
    fun somethingWentWrong()
}