package com.quinsicstudio.framework.security.entity.po;


import com.quinsicstudio.framework.base.entity.BasePo;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
public class BaseAuthenticationPo extends BasePo {

    @Id
    @GenericGenerator(name = "um_base_authentication_generator", strategy = "com.quinsicstudio.framework.base.generator.SnowflakeIdGenerator")
    @GeneratedValue(generator = "um_base_authentication_generator")
    @Column(name = "id")
    private Long id;

    @Column(name = "id")
    private String credential;

    @Column(name = "auth_type")
    private String authType;
}
