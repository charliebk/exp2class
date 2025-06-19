class IfcElectricGenerator(IfcEnergyConversionDevice):
    def __init__(self):
        self.PredefinedType: IfcElectricGeneratorTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcElectricGeneratorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricGeneratorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCELECTRICGENERATORTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
