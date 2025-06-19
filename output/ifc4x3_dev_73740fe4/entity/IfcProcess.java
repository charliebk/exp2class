package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcProcess extends IfcObject {

    public IfcIdentifier Identification; // OPTIONAL
    public IfcText LongDescription; // OPTIONAL
    // INVERSE attributes:
    // IsPredecessorTo : SET [0:?] OF IfcRelSequence FOR RelatingProcess;
    // IsSuccessorFrom : SET [0:?] OF IfcRelSequence FOR RelatedProcess;
    // OperatesOn : SET [0:?] OF IfcRelAssignsToProcess FOR RelatingProcess;

    // SUPERTYPE OF:
    // - IfcEvent
    // - IfcProcedure
    // - IfcTask SUBTYPE OF IfcObject
}
