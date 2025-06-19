package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public abstract class IfcFeatureElementSubtraction extends IfcFeatureElement {

    // INVERSE attributes:
    // VoidsElements : IfcRelVoidsElement FOR RelatedOpeningElement;
    // INVERSE attributes:
    // HasNoSubtraction : SIZEOF(SELF\IfcElement.HasOpenings) = 0;
    // IsNotFilling : SIZEOF(SELF\IfcElement.FillsVoids) = 0;

    // SUPERTYPE OF:
    // - IfcEarthworksCut
    // - IfcOpeningElement
    // - IfcVoidingFeature SUBTYPE OF IfcFeatureElement

    // WHERE constraints:
    // HasNoSubtraction : SIZEOF(SELF\IfcElement.HasOpenings) = 0;
    // IsNotFilling : SIZEOF(SELF\IfcElement.FillsVoids) = 0;
}
