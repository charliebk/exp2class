package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcTypeProcess extends IfcTypeObject {

    public IfcIdentifier Identification; // OPTIONAL
    public IfcText LongDescription; // OPTIONAL
    public IfcLabel ProcessType; // OPTIONAL
    // INVERSE attributes:
    // OperatesOn : SET [0:?] OF IfcRelAssignsToProcess FOR RelatingProcess;

    // SUPERTYPE OF:
    // - IfcEventType
    // - IfcProcedureType
    // - IfcTaskType SUBTYPE OF IfcTypeObject
}
