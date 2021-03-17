package com.southwind.mybatisplus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MyAutoGenerator {
    public static void main(String[] args) {
        AutoGenerator myAuto = new AutoGenerator();
        DataSourceConfig dataS = new DataSourceConfig();
        dataS.setDbType(DbType.MYSQL);
        dataS.setUrl("jdbc:mysql://192.168.0.11:3306/world?useUnicode=true");
        dataS.setUsername("root");
        dataS.setPassword("king-pin");
        dataS.setDriverName("com.mysql.cj.jdbc.Driver");
        myAuto.setDataSource(dataS);

        GlobalConfig gC = new GlobalConfig();
        gC.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        gC.setOpen(false);
        gC.setAuthor("Leon.King");
        myAuto.setGlobalConfig(gC);

        PackageConfig pC = new PackageConfig();
        pC.setParent("com.southwind.mybatisplus");
        //pC.setModuleName("generator");
        pC.setController("controller");
        pC.setService("service");
        pC.setServiceImpl("service.impl");
        pC.setMapper("mapper");
        pC.setEntity("entity");
        myAuto.setPackageInfo(pC);

        StrategyConfig sC = new StrategyConfig();
        sC.setEntityLombokModel(true);
        sC.setColumnNaming(NamingStrategy.underline_to_camel);//自动驼峰
        myAuto.setStrategy(sC);

        myAuto.execute();

    }
}
