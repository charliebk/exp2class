class IfcCoordinateOperation:
    def __init__(self):
        self.SourceCRS: IfcCoordinateReferenceSystemSelect = None
        self.TargetCRS: IfcCoordinateReferenceSystem = None

    # === EXTENDED BY ===
    # IfcMapConversion
    # IfcRigidOperation
