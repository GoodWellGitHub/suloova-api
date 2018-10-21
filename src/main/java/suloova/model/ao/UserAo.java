package suloova.model.ao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by huajun.wang01 on 2018/10/21.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAo implements Serializable{
    private Integer Id;
}
