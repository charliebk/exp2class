class IfcStructuralLoadSingleDisplacementDistortion(IfcStructuralLoadSingleDisplacement):
    def __init__(self):
        self.Distortion: IfcCurvatureMeasure = None
