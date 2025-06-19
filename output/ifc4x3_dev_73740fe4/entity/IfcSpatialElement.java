package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcSpatialElement extends IfcProduct {

    public IfcLabel LongName; // OPTIONAL
    // INVERSE attributes:
    // ContainsElements : SET [0:?] OF IfcRelContainedInSpatialStructure FOR RelatingStructure;
    // ServicedBySystems : SET [0:?] OF IfcRelServicesBuildings FOR RelatedBuildings;
    // ReferencesElements : SET [0:?] OF IfcRelReferencedInSpatialStructure FOR RelatingStructure;
    // IsInterferedByElements : SET [0:?] OF IfcRelInterferesElements FOR RelatedElement;
    // InterferesElements : SET [0:?] OF IfcRelInterferesElements FOR RelatingElement;

    // SUPERTYPE OF:
    // - IfcExternalSpatialStructureElement
    // - IfcSpatialStructureElement
    // - IfcSpatialZone SUBTYPE OF IfcProduct
}
