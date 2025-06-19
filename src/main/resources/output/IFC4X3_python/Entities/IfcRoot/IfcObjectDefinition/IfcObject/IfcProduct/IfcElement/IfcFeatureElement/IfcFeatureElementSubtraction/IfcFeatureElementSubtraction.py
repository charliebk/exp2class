class IfcFeatureElementSubtraction(IfcFeatureElement):
    def __init__(self):
        pass

    # === EXTENDED BY ===
    # IfcEarthworksCut
    # IfcOpeningElement
    # IfcVoidingFeature

    # === INVERSE CLAUSES ===
    # VoidsElements : IfcRelVoidsElement FOR RelatedOpeningElement

    # === WHERE CLAUSES ===
    # HasNoSubtraction : SIZEOF(SELF\IfcElement.HasOpenings) = 0
    # IsNotFilling : SIZEOF(SELF\IfcElement.FillsVoids) = 0
