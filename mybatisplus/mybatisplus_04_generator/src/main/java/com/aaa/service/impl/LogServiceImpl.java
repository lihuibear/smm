package com.aaa.service.impl;

import com.aaa.domain.Log;
import com.aaa.dao.LogDao;
import com.aaa.service.ILogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 黑马程序员
 * @since 2024-03-09
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogDao, Log> implements ILogService {

}
