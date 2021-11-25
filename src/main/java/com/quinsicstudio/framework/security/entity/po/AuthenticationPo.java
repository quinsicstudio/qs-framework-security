package com.quinsicstudio.framework.security.entity.po;


import com.quinsicstudio.framework.base.entity.BasePo;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name = "um_authentication")
public class AuthenticationPo extends BasePo {

    @Id
    @GenericGenerator(name = "um_authentication_generator", strategy = "com.quinsicstudio.framework.base.generator.SnowflakeIdGenerator")
    @GeneratedValue(generator = "um_authentication_generator")
    @Column(name = "id")
    private Long id;
}
