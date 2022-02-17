   if (income <= brackets[s][0]) {
                    return income * rates[0];
                }
                if (income <= brackets[s][1]) {
                    return (brackets[s][0] * rates[0]) + (income - brackets[s][0]) * rates[1];
                }
                if (income <= brackets[s][2]) {
                    return (brackets[s][0] * rates[0]) +
                            (brackets[s][1] - brackets[s][0]) * rates[1] +
                            (income - brackets[s][1]) * rates[2];
                }
                if (income <= brackets[s][3]) {
                    return (brackets[s][0] * rates[0]) +
                            (brackets[s][1] - brackets[s][0]) * rates[1] +
                            (brackets[s][2] - brackets[s][1]) * rates[2] +
                            (income - brackets[s][2]) * rates[3];
                }
                if (income <= brackets[s][4]){
                    return (brackets[s][0] * rates[0]) +
                            (brackets[s][1] - brackets[s][0]) * rates[1] +
                            (brackets[s][2] - brackets[s][1]) * rates[2] +
                            (brackets[s][3] - brackets[s][2]) * rates[3] +
                            (income - brackets[s][3]) * rates[4];
                }
                            
                return (brackets[s][0] * rates[0]) +
                        (brackets[s][1] - brackets[s][0]) * rates[1] +
                        (brackets[s][2] - brackets[s][1]) * rates[2] +
                        (brackets[s][3] - brackets[s][2]) * rates[3] +
                        (brackets[s][4] - brackets[s][3]) * rates[4] +
                        (income - brackets[s][4]) * rates[5];
            }