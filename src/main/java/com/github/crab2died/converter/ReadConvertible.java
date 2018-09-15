/*
 *
 *                  Copyright 2017 Crab2Died
 *                     All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Browse for more information ：
 * 1) https://gitee.com/Crab2Died/Excel4J
 * 2) https://github.com/Crab2died/Excel4J
 *
 */
package com.github.crab2died.converter;

/**
 * 写入excel内容转换器
 *
 * @author junmingyang
 */
public interface ReadConvertible {

    /**
     * 读取Excel列内容转换
     *
     * @param object 待转换数据
     * @return 转换完成的结果
     * @see com.github.crab2died.annotation.ExcelField#readConverter()
     */
    Object execRead(String object);

    Object execRead(String object, String language);


}
