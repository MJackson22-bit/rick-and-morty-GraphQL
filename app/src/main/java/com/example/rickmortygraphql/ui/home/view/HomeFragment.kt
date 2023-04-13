package com.example.rickmortygraphql.ui.home.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rickmortygraphql.databinding.FragmentHomeBinding
import com.example.rickmortygraphql.ui.base.BaseFragment
import com.example.rickmortygraphql.ui.home.view.adapter.CharacterAdapter
import com.example.rickmortygraphql.ui.home.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    private val viewModel: HomeViewModel by viewModels()

    private var adapter: CharacterAdapter? = null

    override fun getViewBinding() = FragmentHomeBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setObservers()
        setAdapter()
        viewModel.getCharacters()
    }

    private fun setAdapter() {
        adapter = CharacterAdapter()
        binding.homeCharacterRecycler.layoutManager = LinearLayoutManager(context)
        binding.homeCharacterRecycler.adapter = adapter
    }

    private fun setObservers() {
        viewModel.characters.observe(viewLifecycleOwner) {
            adapter?.updateDataSet(it)
        }
    }
}