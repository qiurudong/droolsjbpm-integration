/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.kie.server.services.jbpm.ui.form;


/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label(value = "Purchase Order")
public class PurchaseOrder  implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label(value = "Total")
    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.Double total;

    @org.kie.api.definition.type.Label(value = "Description")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String description;

    @org.kie.api.definition.type.Label(value = "Lines")
    @org.kie.api.definition.type.Position(value = 2)
    private java.util.List<PurchaseOrderLine> lines;

    @org.kie.api.definition.type.Label(value = "Header")
    @org.kie.api.definition.type.Position(value = 1)
    private PurchaseOrderHeader header;

    @org.kie.api.definition.type.Position(value = 4)
    private java.lang.Boolean requiresCFOApproval;

    public PurchaseOrder() {
    }

    public PurchaseOrder(java.lang.String description, PurchaseOrderHeader header, java.util.List<PurchaseOrderLine> lines, java.lang.Double total, java.lang.Boolean requiresCFOApproval) {
        this.description = description;
        this.header = header;
        this.lines = lines;
        this.total = total;
        this.requiresCFOApproval = requiresCFOApproval;
    }



    public java.lang.Double getTotal() {
        return this.total;
    }

    public void setTotal(  java.lang.Double total ) {
        this.total = total;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public void setDescription(  java.lang.String description ) {
        this.description = description;
    }

    public java.util.List<PurchaseOrderLine> getLines() {
        return this.lines;
    }

    public void setLines(  java.util.List<PurchaseOrderLine> lines ) {
        this.lines = lines;
    }

    public PurchaseOrderHeader getHeader() {
        return this.header;
    }

    public void setHeader(  PurchaseOrderHeader header ) {
        this.header = header;
    }

    public java.lang.Boolean getRequiresCFOApproval() {
        return this.requiresCFOApproval;
    }

    public void setRequiresCFOApproval(  java.lang.Boolean requiresCFOApproval ) {
        this.requiresCFOApproval = requiresCFOApproval;
    }




}