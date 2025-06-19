package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRelConnectsStructuralMember extends IfcRelConnects {

    public IfcStructuralMember RelatingStructuralMember;
    public IfcStructuralConnection RelatedStructuralConnection;
    public IfcBoundaryCondition AppliedCondition; // OPTIONAL
    public IfcStructuralConnectionCondition AdditionalConditions; // OPTIONAL
    public IfcLengthMeasure SupportedLength; // OPTIONAL
    public IfcAxis2Placement3D ConditionCoordinateSystem; // OPTIONAL

    // SUPERTYPE OF:
    // - IfcRelConnectsWithEccentricity SUBTYPE OF IfcRelConnects
}
