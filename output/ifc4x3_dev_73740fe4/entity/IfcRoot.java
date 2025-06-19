package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public abstract class IfcRoot {

    public IfcGloballyUniqueId GlobalId;
    public IfcOwnerHistory OwnerHistory; // OPTIONAL
    public IfcLabel Name; // OPTIONAL
    public IfcText Description; // OPTIONAL
    // INVERSE attributes:
    // UR1 : GlobalId;

    // SUPERTYPE OF:
    // - IfcObjectDefinition
    // - IfcPropertyDefinition
    // - IfcRelationship
}
