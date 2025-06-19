package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public abstract class IfcSweptAreaSolid extends IfcSolidModel {

    public IfcProfileDef SweptArea;
    public IfcAxis2Placement3D Position; // OPTIONAL
    // INVERSE attributes:
    // SweptAreaType : SweptArea.ProfileType = IfcProfileTypeEnum.Area;

    // SUPERTYPE OF:
    // - IfcDirectrixCurveSweptAreaSolid
    // - IfcExtrudedAreaSolid
    // - IfcRevolvedAreaSolid SUBTYPE OF IfcSolidModel

    // WHERE constraints:
    // SweptAreaType : SweptArea.ProfileType = IfcProfileTypeEnum.Area;
}
