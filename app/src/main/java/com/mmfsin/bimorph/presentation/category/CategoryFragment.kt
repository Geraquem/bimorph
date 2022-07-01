package com.mmfsin.bimorph.presentation.category

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mmfsin.bimorph.databinding.FragmentCategoryBinding
import com.mmfsin.bimorph.domain.models.DTOCategory

class CategoryFragment : Fragment(), CategoryView {

    private var _bdg: FragmentCategoryBinding? = null
    private val binding get() = _bdg!!

    private val presenter by lazy { CategoryPresenter(this) }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _bdg = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.getCategoryNames()
    }

    override fun setCategoryNames(names: List<DTOCategory>) {
        names
    }

    override fun somethingWentWrong() {}

}