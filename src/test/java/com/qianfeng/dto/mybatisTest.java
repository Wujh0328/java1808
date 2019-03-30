package com.qianfeng.dto;

import com.qianfeng.mapper.CityMapper;
import com.qianfeng.mapper.ProvinceMapper;
import com.qianfeng.mapper.WxbGoodSkuMapper;
import com.qianfeng.mapper.WxbGoodMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class mybatisTest {

    /**
     * 关联查询：多对多 1808
     */
    @Test
    public void testcase1(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.cfg.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sessionFactory.openSession();
            WxbGoodMapper mapper = sqlSession.getMapper(WxbGoodMapper.class);
            List<WxbGood> wxbGood = mapper.queryGoodAndGoodSku();
            System.out.println(wxbGood);
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 联合添加
     */
    @Test
    public void testCase2(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.cfg.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sessionFactory.openSession();
            WxbGood wxbGood = new WxbGood();
            String s = UUID.randomUUID().toString();
            Timestamp time = new Timestamp(new Date().getTime());
            String str = s.substring(0,8);
            wxbGood.setGoodId(str);
            wxbGood.setGoodName("手机");
            wxbGood.setCustomerId("10");
            wxbGood.setGoodPic("XXX");
            wxbGood.setGoodPic1("XXX");
            wxbGood.setGoodPic2("XXX");
            wxbGood.setPromoteDesc("在线推广");
            wxbGood.setSkuTitle("智能");
            wxbGood.setSkuCost("3000");
            wxbGood.setSkuPrice("4000");
            wxbGood.setSkuPmoney("200");
            wxbGood.setCopyIds("10");
            wxbGood.setCopyDesc("yyy");
            wxbGood.setForwardLink("www.xxx.com");
            wxbGood.setOrderNo(10);
            wxbGood.setTypeId("20");
            wxbGood.setTags("智能手机");
            wxbGood.setState(0);
            wxbGood.setCreateTime(time);
            wxbGood.setToped(0);
            wxbGood.setRecomed(0);
            wxbGood.setTopedTime(time);
            wxbGood.setRecomedTime(time);
            wxbGood.setSpcId("20");
            wxbGood.setZonId("30");
            wxbGood.setSellNum(10);
            wxbGood.setWebsite("www.xxx.com");
            wxbGood.setIswxpay(1);
            wxbGood.setIsfdfk(0);
            wxbGood.setLeixingId(0);
            wxbGood.setKfqq("0");
            WxbGoodMapper mapper = sqlSession.getMapper(WxbGoodMapper.class);
            mapper.goodSave(wxbGood);
            WxbGoodSku wxbGoodSku = new WxbGoodSku();
            wxbGoodSku.setGoodId(wxbGood.getGoodId());
            wxbGoodSku.setSkuId(str);
            wxbGoodSku.setSkuName("经济套餐");
            wxbGoodSku.setSkuCost("2000");
            wxbGoodSku.setSkuPrice("3000");
            wxbGoodSku.setSkuPmoney("100");
            wxbGoodSku.setOrderNo(10);
            wxbGoodSku.setServiceMoney("100");
            WxbGoodSkuMapper mapper1 = sqlSession.getMapper(WxbGoodSkuMapper.class);
            mapper1.skuSave(wxbGoodSku);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testCase3(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.cfg.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sessionFactory.openSession();
            ProvinceMapper mapper = sqlSession.getMapper(ProvinceMapper.class);
            List<Province> provinces = mapper.queryProvinceAndCityAndRegion();
            System.out.println(provinces);
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
