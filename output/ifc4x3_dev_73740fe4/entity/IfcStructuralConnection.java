package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcStructuralConnection extends IfcStructuralItem {

    public IfcBoundaryCondition AppliedCondition; // OPTIONAL
    // INVERSE attributes:
    // ConnectsStructuralMembers : SET [1:?] OF IfcRelConnectsStructuralMember FOR RelatedStructuralConnection;

    // SUPERTYPE OF:
    // - IfcStructuralCurveConnection
    // - IfcStructuralPointConnection
    // - IfcStructuralSurfaceConnection SUBTYPE OF IfcStructuralItem
}
