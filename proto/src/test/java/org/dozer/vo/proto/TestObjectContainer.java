/**
 * Copyright 2005-2017 Dozer Project
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
package org.dozer.vo.proto;

/**
 * @author Dmitry Spikhalskiy
 */
public class TestObjectContainer {
  private TestObject nested;
  private String one;

  public TestObjectContainer() {
  }

  public TestObjectContainer(TestObject nested, String one) {
    this.nested = nested;
    this.one = one;
  }

  public String getOne() {
    return one;
  }

  public void setOne(String one) {
    this.one = one;
  }

  public TestObject getNested() {
    return nested;
  }

  public void setNested(TestObject nested) {
    this.nested = nested;
  }
}
