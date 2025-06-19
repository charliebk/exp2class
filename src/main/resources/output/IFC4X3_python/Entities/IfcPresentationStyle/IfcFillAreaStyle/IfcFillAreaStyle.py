class IfcFillAreaStyle(IfcPresentationStyle):
    def __init__(self):
        self.FillStyles: SET [1:?] OF IfcFillStyleSelect = None
        self.ModelOrDraughting: IfcBoolean = None

    # === WHERE CLAUSES ===
    # ConsistentHatchStyleDef : IfcCorrectFillAreaStyle(SELF.FillStyles)
    # MaxOneColour : SIZEOF(QUERY(Style <* SELF.FillStyles | 'IFC4X3_DEV_73740fe4.IFCCOLOUR' IN TYPEOF(Style) )) <= 1
    # MaxOneExtHatchStyle : SIZEOF(QUERY(Style <* SELF.FillStyles | 'IFC4X3_DEV_73740fe4.IFCEXTERNALLYDEFINEDHATCHSTYLE' IN TYPEOF(Style) )) <= 1
