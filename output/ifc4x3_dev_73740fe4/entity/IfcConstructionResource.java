package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public abstract class IfcConstructionResource extends IfcResource {

    public IfcResourceTime Usage; // OPTIONAL
    public IfcPhysicalQuantity BaseQuantity; // OPTIONAL

    // SUPERTYPE OF:
    // - IfcConstructionEquipmentResource
    // - IfcConstructionMaterialResource
    // - IfcConstructionProductResource
    // - IfcCrewResource
    // - IfcLaborResource
    // - IfcSubContractResource SUBTYPE OF IfcResource
}
