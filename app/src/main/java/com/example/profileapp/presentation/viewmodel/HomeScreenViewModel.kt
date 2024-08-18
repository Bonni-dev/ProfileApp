package com.example.profileapp.presentation.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
//
//@HiltViewModel
//class HomeScreenViewModel @Inject constructor(
//    private val newsRepository: NewsRepository
//) : ViewModel() {
//
//
//    private val _news: MutableStateFlow<ResourceState<NewsResponse>> =
//        MutableStateFlow(ResourceState.Loading())
//    val news: StateFlow<ResourceState<NewsResponse>> = _news
//
//
//    private fun getNews(country: String) {
//        viewModelScope.launch() {
//            newsRepository.getNewsHeadline(country)
//                .collectLatest { newsResponse ->
//                    _news.value = newsResponse
//                }
//        }
//    }
//}