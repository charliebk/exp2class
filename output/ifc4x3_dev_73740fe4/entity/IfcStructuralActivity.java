package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcStructuralActivity extends IfcProduct {

    public IfcStructuralLoad AppliedLoad;
    public IfcGlobalOrLocalEnum GlobalOrLocal;
    // INVERSE attributes:
    // AssignedToStructuralItem : SET [0:1] OF IfcRelConnectsStructuralActivity FOR RelatedStructuralActivity;

    // SUPERTYPE OF:
    // - IfcStructuralAction
    // - IfcStructuralReaction SUBTYPE OF IfcProduct
}
