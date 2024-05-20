package com.yupi.springbootinit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.springbootinit.model.entity.InterfaceInfo;
import com.yupi.springbootinit.model.entity.Post;

/**
* @author mar
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-05-20 15:13:56
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

//    void validInterfaceInfo(Post post, boolean add);

    void validInterfaceInfo(InterfaceInfo post, boolean add);
}
