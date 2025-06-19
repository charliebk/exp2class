package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcSweptDiskSolidPolygonal extends IfcSweptDiskSolid {

    public IfcNonNegativeLengthMeasure FilletRadius; // OPTIONAL
    // INVERSE attributes:
    // CorrectRadii : NOT(EXISTS(FilletRadius)) OR (FilletRadius >= SELF\IfcSweptDiskSolid.Radius);
    // DirectrixIsPolyline : ('IFC4X3_DEV_73740fe4.IFCPOLYLINE' IN TYPEOF(SELF\IfcSweptDiskSolid.Directrix)) OR
    // (('IFC4X3_DEV_73740fe4.IFCINDEXEDPOLYCURVE' IN TYPEOF(SELF\IfcSweptDiskSolid.Directrix)) AND NOT(EXISTS(SELF\IfcSweptDiskSolid.Directrix\IfcIndexedPolyCurve.Segments)));

    // WHERE constraints:
    // CorrectRadii : NOT(EXISTS(FilletRadius)) OR (FilletRadius >= SELF\IfcSweptDiskSolid.Radius);
    // DirectrixIsPolyline : ('IFC4X3_DEV_73740fe4.IFCPOLYLINE' IN TYPEOF(SELF\IfcSweptDiskSolid.Directrix)) OR
    // (('IFC4X3_DEV_73740fe4.IFCINDEXEDPOLYCURVE' IN TYPEOF(SELF\IfcSweptDiskSolid.Directrix)) AND NOT(EXISTS(SELF\IfcSweptDiskSolid.Directrix\IfcIndexedPolyCurve.Segments)));
}
