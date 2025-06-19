package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcContext extends IfcObjectDefinition {

    public IfcLabel ObjectType; // OPTIONAL
    public IfcLabel LongName; // OPTIONAL
    public IfcLabel Phase; // OPTIONAL
    public IfcUnitAssignment UnitsInContext; // OPTIONAL
    // INVERSE attributes:
    // IsDefinedBy : SET [0:?] OF IfcRelDefinesByProperties FOR RelatedObjects;
    // Declares : SET [0:?] OF IfcRelDeclares FOR RelatingContext;

    // SUPERTYPE OF:
    // - IfcProject
    // - IfcProjectLibrary SUBTYPE OF IfcObjectDefinition
}
