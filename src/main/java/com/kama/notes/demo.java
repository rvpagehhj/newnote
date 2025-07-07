package com.kama.notes;

import com.kama.notes.utils.SearchUtils; // 添加缺失的导入语句

public class demo {
    public static void main(String[] args) {
        String key = "人工智能，dwqdqwd java";
        System.out.println(SearchUtils.preprocessKeyword(key)); // 修正方法调用
    }
}