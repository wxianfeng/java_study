package com.wxianfeng.open.leetcode.dingcode.three;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/08/24 2:20 PM
 *
 * // 在开发中，我们经常需要使用到ElasticSearch、OpeanSearch等
 * // 许多同学会针对这些搜索工具提供的SDK，封装一些常用的操作工具类
 * // 下面是一段搜索查询的实现代码
 * // 请提出这段代码中的问题，及你认为合理的修改方案
 * switch (key) {
 * 	case EQUALS:
 * 		query = queryStringQuery(searchText).field(fieldName).defaultOperator(AND);
 *     	break;
 * 	case CONTAINS:
 * 		query = queryStringQuery("*" + searchText + "*").field(fieldName).analyzeWildcard(true);
 * 		break;
 * 	case STARTS_WITH:
 * 		query = queryStringQuery(searchText + "*").field(fieldName).analyzeWildcard(true);
 * 		break;
 * 	case ENDS_WITH:
 * 		query = queryStringQuery("*" + searchText).field(fieldName).analyzeWildcard(true);
 * 		break;
 * 	case EXPRESSION:
 * 		query = queryStringQuery(searchText).field(fieldName);
 * 		break;
 * 	case LESS_EQUAL:
 * 		query = rangeQuery(fieldName).lte(value);
 * 		break;
 * 	// ......
 *     // 省略很多很多case
 *     // ......
 *
 */
public class ManySwitch {

    public void search(Enum searchEnum, String searchText) {
//        Map<?, Function<?> action> maps = new HashMap<>();
//
//        maps.put(EQUALS, (someParams) -> { doAction1(someParams)});
//        maps.put(CONTAINS, (someParams) -> { doAction2(someParams)});
//        maps.put(STARTS_WITH, (someParams) -> { doAction3(someParams)});
//
//        maps.get(search).apply(someParams);
    }

}
