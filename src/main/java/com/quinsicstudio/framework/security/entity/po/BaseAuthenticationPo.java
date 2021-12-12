package com.quinsicstudio.framework.security.entity.po;


import com.quinsicstudio.framework.base.entity.BasePo;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name = "um_authentication")
public class BaseAuthenticationPo extends BasePo {

    @Id
    @GenericGenerator(name = "um_base_authentication_generator", strategy = "com.quinsicstudio.framework.base.generator.SnowflakeIdGenerator")
    @GeneratedValue(generator = "um_base_authentication_generator")
    @Column(name = "id")
    private Long id;

}
