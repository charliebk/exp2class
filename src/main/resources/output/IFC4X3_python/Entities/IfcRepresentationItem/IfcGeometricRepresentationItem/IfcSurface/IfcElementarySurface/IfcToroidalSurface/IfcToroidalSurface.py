class IfcToroidalSurface(IfcElementarySurface):
    def __init__(self):
        self.MajorRadius: IfcPositiveLengthMeasure = None
        self.MinorRadius: IfcPositiveLengthMeasure = None

    # === WHERE CLAUSES ===
    # MajorLargerMinor : MinorRadius < MajorRadius
