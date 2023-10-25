package com.oop.lab6.ex1.polinominal;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public double evaluate(double x) {
        double result = 0;
        int n = getDegree();
        for (int i = n; i >= 0; i--) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial another) {
        int thisDegree = getDegree();
        int anotherDegree = another.getDegree();
        int maxDegree = Math.max(thisDegree, anotherDegree);
        double[] resultCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            if (i <= thisDegree) {
                resultCoeffs[i] += coeffs[i];
            }
            if (i <= anotherDegree) {
                resultCoeffs[i] += another.coeffs[i];
            }
        }

        return new MyPolynomial(resultCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial another) {
        int thisDegree = getDegree();
        int anotherDegree = another.getDegree();
        int productDegree = thisDegree + anotherDegree;
        double[] resultCoeffs = new double[productDegree + 1];

        for (int i = 0; i <= thisDegree; i++) {
            for (int j = 0; j <= anotherDegree; j++) {
                resultCoeffs[i + j] += coeffs[i] * another.coeffs[j];
            }
        }

        return new MyPolynomial(resultCoeffs);
    }

    @Override
    public String toString() {
        if (coeffs.length == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        int degree = getDegree();

        for (int i = degree; i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (i == degree) {
                    sb.append(coeffs[i]);
                } else {
                    sb.append((coeffs[i] > 0) ? " + " : " - ");
                    sb.append(Math.abs(coeffs[i]));
                }
                if (i > 0) {
                    sb.append("x");
                    if (i > 1) {
                        sb.append("^").append(i);
                    }
                }
            }
        }

        return sb.toString();
    }
}
