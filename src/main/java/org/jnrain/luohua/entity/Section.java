/*
 * Copyright 2012 JNRain
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.jnrain.luohua.entity;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Section {
    private String _ord;
    private String _name;
    private List<String> _topics;

    public String getOrd() {
        return this._ord;
    }

    public void setOrd(String ord) {
        this._ord = ord;
    }

    public String getName() {
        return this._name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public List<String> getTopics() {
        return this._topics;
    }

    public void setTopics(List<String> topics) {
        this._topics = topics;
    }

    public String toString() {
        return ("<Section: " + this._ord + ". " + this._name + " topics: "
                + this._topics.toString() + ">");
    }
}
