package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcElementAssembly extends IfcElement {

    public IfcAssemblyPlaceEnum AssemblyPlace; // OPTIONAL
    public IfcElementAssemblyTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcElementAssemblyTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcElementAssemblyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCELEMENTASSEMBLYTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcElementAssemblyTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcElementAssemblyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCELEMENTASSEMBLYTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));
}
