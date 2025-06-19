class IfcUnitaryControlElement(IfcDistributionControlElement):
    def __init__(self):
        self.PredefinedType: IfcUnitaryControlElementTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcUnitaryControlElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcUnitaryControlElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCUNITARYCONTROLELEMENTTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
