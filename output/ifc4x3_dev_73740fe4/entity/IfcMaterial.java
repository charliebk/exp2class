package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcMaterial extends IfcMaterialDefinition {

    public IfcLabel Name;
    public IfcText Description; // OPTIONAL
    public IfcLabel Category; // OPTIONAL
    // INVERSE attributes:
    // HasRepresentation : SET [0:1] OF IfcMaterialDefinitionRepresentation FOR RepresentedMaterial;
    // IsRelatedWith : SET [0:?] OF IfcMaterialRelationship FOR RelatedMaterials;
    // RelatesTo : SET [0:1] OF IfcMaterialRelationship FOR RelatingMaterial;
}
