/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.beans.rtest;

import java.util.HashSet;
import java.util.Set;


/**
 * 
 * @author Administrator
 * @since 4.3
 */
public class MyTestBean {
	private String testStr = "testStr";
	private final ThreadLocal<Set<String>> resourcesCurrentlyBeingLoaded =
			new ThreadLocal<Set<String>>();
	
	public String getTestStr() {
		return testStr;
	}

	
	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
	
	public void test(){
		String a = "tst";
		Set<String> testSet = new HashSet<String>();
		testSet.add(a);
		/*this.resourcesCurrentlyBeingLoaded.set(testSet);
		Set<String> rsrc = this.resourcesCurrentlyBeingLoaded.get();*/
		boolean flag = testSet.add(a);
		System.out.println(flag);
		
	}
	
	public static void main(String[] args) {
		MyTestBean bean = new MyTestBean();
		bean.test();
	}
	
}
