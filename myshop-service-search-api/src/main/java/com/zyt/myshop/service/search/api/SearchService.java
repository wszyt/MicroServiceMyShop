package com.zyt.myshop.service.search.api;

import com.zyt.myshop.service.search.domain.TbItemResult;

import java.util.List;

public interface SearchService {
    List<TbItemResult> search(String query, int page, int rows);
}
