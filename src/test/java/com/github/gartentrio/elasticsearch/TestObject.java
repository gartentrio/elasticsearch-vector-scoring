/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.github.gartentrio.elasticsearch;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Created by Lior Knaany on 4/7/18.
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class TestObject {
    int jobId;
    float[] vector;

    public int getJobId() {
        return jobId;
    }

    public float[] getVector() {
        return vector;
    }

    public TestObject(int jobId, float[] vector) {
        this.jobId = jobId;
        this.vector = vector;
    }
}
