package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcMaterialLayer extends IfcMaterialDefinition {

    public IfcMaterial Material; // OPTIONAL
    public IfcNonNegativeLengthMeasure LayerThickness;
    public IfcLogical IsVentilated; // OPTIONAL
    public IfcLabel Name; // OPTIONAL
    public IfcText Description; // OPTIONAL
    public IfcLabel Category; // OPTIONAL
    public IfcInteger Priority; // OPTIONAL
    // INVERSE attributes:
    // ToMaterialLayerSet : IfcMaterialLayerSet FOR MaterialLayers;
    // INVERSE attributes:
    // NormalizedPriority : NOT(EXISTS(Priority)) OR {0 <= Priority <= 100};

    // SUPERTYPE OF:
    // - IfcMaterialLayerWithOffsets SUBTYPE OF IfcMaterialDefinition

    // WHERE constraints:
    // NormalizedPriority : NOT(EXISTS(Priority)) OR {0 <= Priority <= 100};
}
