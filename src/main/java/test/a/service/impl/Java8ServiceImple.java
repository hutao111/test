package test.a.service.impl;

import test.a.entity.Java8;

import test.a.mapper.Java8mapper;
import test.a.service.Java8Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hutao123
 * @since 2019-04-13
 */
@Service
public class Java8ServiceImple extends ServiceImpl<Java8mapper, Java8> implements Java8Service {

    @Override
    public int sd() {
        return 0;
    }
}
