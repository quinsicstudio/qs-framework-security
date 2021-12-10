package com.quinsicstudio.framework.security.entity.po;

import com.quinsicstudio.framework.base.entity.BasePo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@MappedSuperclass
@Getter
@Setter
public class BaseUserPo extends BasePo {

    @Id
    @GenericGenerator(name = "um_base_user_generator", strategy = "com.quinsicstudio.framework.base.generator.SnowflakeIdGenerator")
    @GeneratedValue(generator = "um_base_user_generator")
    @Column(name = "id")
    private Long id;
}
