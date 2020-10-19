/* 
 * Copyright 2020 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class Main {

//      Random
    public static final Random RND = new Random();
    public static final Calendar CAL = Calendar.getInstance();

    public static void main(String[] args) {

//      Constante minimo
        final int H_MIN = 8;
        final int M_MIN = 20;
        final int S_MIN = 0;
//      Constante maximo
        int ha = CAL.get(Calendar.HOUR_OF_DAY);
        int ma = CAL.get(Calendar.MINUTE);
        int sa = CAL.get(Calendar.SECOND);

//      Operacion
//      Sacar los segundos actuales
        int tMin = H_MIN * 3600 + M_MIN * 60 + S_MIN;
        int tMax = ha * 3600 + ma * 60 + sa;
        int tRnd = RND.nextInt(tMax - tMin + 1) - tMin;
//      Sacar los segundos de inicio
        int hi = tRnd / 3600;
        tRnd = tRnd % 3600;
        int mi = tRnd / 60;
        int si = tRnd % 60;

//      Sacar el tiempo transcurrido entre el inicio y el actual
        int dif = tMax - tRnd;
        int hd = dif / 3600;
        tRnd = dif % 3600;
        int md = dif / 60;
        int sd = dif % 60;

//      Sacar por pantalla
        System.out.printf("Hora actual ......: %02d/%02d/%02d %n", ha, ma, sa);
        System.out.printf("Hora inicio ......: %02d/%02d/%02d %n", hi, mi, si);
//      Devolver resultado del calculo
        System.out.printf("Tiempo de clase ..: %02d/%02d/%02d%n", hd, md, sd);

    }

}
