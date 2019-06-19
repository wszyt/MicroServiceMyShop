package com.zyt.myshop.service.search.provider.mapper;

import com.zyt.myshop.service.search.domain.TbItemResult;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbItemResultMapper {
    List<TbItemResult> selectAll();
}
