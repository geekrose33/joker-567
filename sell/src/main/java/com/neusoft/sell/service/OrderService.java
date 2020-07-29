package com.neusoft.sell.service;

import com.neusoft.sell.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {
    /** 查询订单列表. */
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    /** 查询订单列表. */
    Page<OrderDTO> findList(Pageable pageable);
}
