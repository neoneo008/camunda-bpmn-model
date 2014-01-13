/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.camunda.bpm.model.core.type;

import java.util.List;

import org.camunda.bpm.model.core.instance.ModelElementInstance;
import org.camunda.bpm.model.core.type.reference.Reference;

/**
 * @author meyerd
 *
 * @param <T>
 */
public interface Attribute<T> {

  /**
   * returns the value of the attribute.
   *
   * @return the value of the attribute.
   */
  T getValue(ModelElementInstance modelElement);

  /**
   * sets the value of the attribute.
   *
   *  the value of the attribute.
   */
  void setValue(ModelElementInstance modelElement, T value);

  /**
   * @return the namespaceUri
   */
  String getNamespaceUri();

  /**
   * @return the attributeName
   */
  String getAttributeName();

  boolean isIdAttribute();

  ModelElementType getOwningElementType();

  List<Reference<?>> getIncomingReferences();

  List<Reference<?>> getOutgoingReferences();

}
