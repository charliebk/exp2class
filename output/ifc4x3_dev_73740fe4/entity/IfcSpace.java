package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcSpace extends IfcSpatialStructureElement {

    public IfcSpaceTypeEnum PredefinedType; // OPTIONAL
    public IfcLengthMeasure ElevationWithFlooring; // OPTIONAL
    // INVERSE attributes:
    // HasCoverings : SET [0:?] OF IfcRelCoversSpaces FOR RelatingSpace;
    // BoundedBy : SET [0:?] OF IfcRelSpaceBoundary FOR RelatingSpace;
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcSpaceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSpaceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCSPACETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcSpaceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSpaceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCSPACETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));
}
